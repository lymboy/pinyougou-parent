app.controller('baseController', function ($scope) {

    //重新加载列表 数据
    $scope.reloadList = function () {
        //切换页码
        $scope.search($scope.paginationConf.currentPage,
            $scope.paginationConf.itemsPerPage);
    };

    //分页控件配置
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function () {
            $scope.reloadList();//重新加载
        }
    };

    // 选中的 id 集合
    $scope.selectIds = [];
    // 更新复选框
    $scope.updateSelection = function ($event, id) {
        if ($event.target.checked) {
            $scope.selectIds.push(id);
        } else {
            var index = $scope.selectIds.indexOf(id);
            $scope.selectIds.splice(index, 1);
        }
    };

    // 提取json中的某属性拼接成字符串， 逗号分隔
    $scope.jsonToString = function (jsonString, key) {
        // 将json字符床转换成json对象
        var json = JSON.parse(jsonString);
        var str = '';
        for (var i=0; i<json.length; i++) {
            if (i > 0) {
                str += ',';
            }
            str += json[i][key];
        }
        return str;
    };


});