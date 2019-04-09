/**
 * Created by j on 2019/4/9.
 */

var purl = "http://localhost:8080/";

$(function () {
    $("[data-toggle='popover']").popover();
});
login = function (){
    $.ajax({
        type: "POST",
        url: purl+"login",
        data:JSON.stringify({"username":$("#loginUserName").val(),"password":$.md5($("#loginPassword").val())}),
        dataType: "json",
        contentType:"application/json;charset=UTF-8",
        success: function(data){
            if(data.code==="200"){
                $("#loginMsg").text(data.msg);
            }else {
                $("#loginMsg").text(data.msg);
            }
        }
    });
};