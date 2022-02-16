option = {
  tooltip: {
    trigger: 'axis',
    axisPointer: {
      // 不显示： ''
      type: 'line'
    }
  },
  xAxis: {
    type: 'category',
    data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
  },
  yAxis: {
    type: 'value'
  },
  series: [
    {
      data: [
        120,
        {
          value: 200,
          itemStyle: {
            color: 'green'
          }
        },
        150,
        80,
        70,
        110,
        130
      ],
      type: 'bar',
      markLine: {
        data: [
          {
            type: 'average',
            lineStyle: {
              type: 'solid',
              color: 'red'
            }
          }
        ],
        silent: true
      }
    }
  ]
};
