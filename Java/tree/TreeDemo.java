/**
 * 树形菜单的一些基本构建逻辑
 */
class TreeDemo {
    public List<AdminOrganizationView> getOrgTree() {
        // TODO 尝试缓存获取
        List<AdminOrganizationView> viewList = adminOrganizationMapper.selectList();
        // 根据 id 分组
        final Map<Integer, AdminOrganizationView> listMap = viewList.stream()
                .collect(toMap(AdminOrganizationView::getId, adminOrganizationView -> adminOrganizationView));
        // 组装
        List<AdminOrganizationView> resultList = Lists.newArrayList();
        viewList.forEach(data -> {
            if (Is.empty(data.getParentId()) || data.getParentId().equals(-1)) {
                resultList.add(data);
                return;
            }
            // 获取父节点
            final AdminOrganizationView pView = listMap.get(data.getParentId());
            if (Is.empty(pView.getChild())) {
                pView.setChild(new ArrayList<>());
            }
            pView.getChild().add(data);
        });

        // 获取顶级节点
        return resultList;
    }

    public Set<Integer> getParentIds(Integer id) {
        final List<AdminOrganizationView> orgTree = this.getOrgTree();
        return findParentIdsById(orgTree, id);
    }

    public Set<Integer> getChildIds(Integer id) {
        final List<AdminOrganizationView> orgTree = this.getOrgTree();
        final AdminOrganizationView view = findTreeViewById(orgTree, id);
        if (view != null) {
            return findChildIds(view);
        }
        return null;
    }

    /**
     * 根据 id 查找所有的父节点 id，包括此 id
     * @param treeList 树对象
     * @param id 要查找的 id
     * @return 层次 ids
     */
    private Set<Integer> findParentIdsById(List<AdminOrganizationView> treeList, Integer id) {
        for (AdminOrganizationView organizationView : treeList) {
            if (id.equals(organizationView.getId())) {
                return Sets.newHashSet(id);
            }

            if (organizationView.getChild() != null) {
                final Set<Integer> ids = findParentIdsById(organizationView.getChild(), id);
                if (ids != null) {
                    ids.add(organizationView.getId());
                    return ids;
                }
            }
        }
        return null;
    }

    /**
     * 根据 id 查找所有的子节点 id，包括此 id
     * TODO 会频繁创建 Set，可通过参数来传递，去掉返回值
     * @param adminOrganizationView 树对象
     * @return 层次 ids
     */
    private Set<Integer> findChildIds(AdminOrganizationView adminOrganizationView) {
        if (Is.empty(adminOrganizationView.getChild())) {
            return Sets.newHashSet(adminOrganizationView.getId());
        }

        Set<Integer> ids = null;
        for (AdminOrganizationView view : adminOrganizationView.getChild()) {
            if (Is.empty(ids)) {
                ids = findChildIds(view);
            } else {
                ids.addAll(findChildIds(view));
            }
            ids.add(adminOrganizationView.getId());
        }

        return ids;
    }


    private AdminOrganizationView findTreeViewById(List<AdminOrganizationView> treeList, Integer id) {
        for (AdminOrganizationView organizationView : treeList) {
            if (id.equals(organizationView.getId())) {
                return organizationView;
            }

            if (organizationView.getChild() != null) {
                return findTreeViewById(organizationView.getChild(), id);
            }
        }
        return null;
    }
}