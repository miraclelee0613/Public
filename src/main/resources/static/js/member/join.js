// input 클래스 가져온거 기능 만들기
// function alert() {
//   alert("값을 입력해주세요.");
// }


//이름
$("#name-check").on("blur",function(){inputName($(this).val());});
function inputName(memberName){
  check = false;
  if(!memberName){
    $("#name-alert").text("이름을 입력해주세요.");
    $("#name-alert").css("color", "red");
    return;
  }else {
    $("#name-alert").text("");
  }
}

//닉네임
$("#nick-check").on("blur",function(){inputNick($(this).val());});
function inputNick(memberNickname){
  check = false;
  if(!memberNickname){
    $("#nick-alert").text("닉네임을 입력해주세요.");
    $("#nick-alert").css("color", "red");
    return;
  }else {
    $("#nick-alert").text("");
  }
}

//아이디
$("#id-check").on("blur", function(){checkId($(this).val());});

let check = false;
function checkId(memberId){
  check = false;
  if(!memberId){
    $("#id-alert").text("아이디를 입력해주세요.");
    $("#id-alert").css("color", "red");
    return;
  }

  $.ajax({
    type: "POST",
    url: "/member/checkId_sample",
    data: {"memberId": memberId},
    dataType : 'json',
    success: function(result){
      let message, color;
      // alert(result);
      let str = JSON.stringify(result);
      str = replaceXSS(str);
      result = JSON.parse(str);

      alert(result.get(1));
      if(result == "true"){
        message = "사용 가능한 아이디입니다.";
        color = "blue";
        check = true;
      }else{
        message = "중복된 아이디입니다.";
        color = "red";
      }

      $("#id-alert").css("color", color);
      $("#id-alert").text(message);
    },
    error: function(a, b, c){
      console.log(a, b, c);
    }
  });
}

//비밀번호
$("#pw-check").on("blur",function(){inputPW1($(this).val());});
function inputPW1(memberPW){
  check = false;
  if(!memberPW){
    $("#pw-alert").text("비밀번호를 입력해주세요.");
    $("#pw-alert").css("color", "red");
    return;
  }else {
    $("#pw-alert").text("");
  }
}

//비밀번호 확인
$("#pw2-check").on("blur",function(){inputPW2($(this).val());});
function inputPW2(memberPW){
  check = false;
  if(!memberPW){
    $("#pw2-alert").text("비밀번호를 입력해주세요.");
    $("#pw2-alert").css("color", "red");
    return;
  }else {
    $("#pw2-alert").text("");
  }
}

//이메일
$("#mail-check").on("blur",function(){inputEmail($(this).val());});
function inputEmail(memberEmail){
  check = false;
  if(!memberEmail){
    $("#mail-alert").text("이메일을 입력해주세요.");
    $("#mail-alert").css("color", "red");
    return;
  }else {
    $("#mail-alert").text("");
  }
}

//휴대폰 번호
$("#phone-check").on("blur",function(){inputMobile($(this).val());});
function inputMobile(memberMobile){
  check = false;
  if(!memberMobile){
    $("#phone-alert").text("휴대폰번호를 입력해주세요.");
    $("#phone-alert").css("color", "red");
    return;
  }else {
    $("#phone-alert").text("");
  }
}

//회원가입
$(document).ready(function(){
  $(".join-btn").click(function(){
    $("#join-form").attr("action", "/member/join");
    $("#join-form").submit();
  });
});

//로그인
$(document).ready(function(){
  $(".login-btn").click(function(){
    $("#login-form").attr("action", "/member/login");
    $("#login-form").submit();
  });
});

// 아이디 중복 체크

// 이메일 휴대폰번호 비밀번호 정규식