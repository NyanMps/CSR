navigator.clipboard.writeText(names.join(' ')).then(() => {
  this.$message({
    message: '复制成功！',
    type: 'success',
  });
}, console.error);
