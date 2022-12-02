function newMembers(){
    $.ajax({
        type: "POST",
        url: "/admin/userList",
        dataType: "text",
        contentType : "application/json;charset=UTF-8",
        error: function() {
            console.log('통신실패!!');
        },
        success: function(data) {
            console.log("통신데이터 값 : " + data);
        }
    });
}

$(".item").click(newMembers());