// input 클래스 가져온거 기능 만들기
// function alert() {
//   alert("값을 입력해주세요.");
// }


//비밀번호 확인
$(function(){
  $('#pw2-check').blur(function(){
    if($('#pw-check').val() != $('#pw2-check').val()){
      if($('#pw2-check').val()!=''){
        alert("비밀번호가 일치하지 않습니다.");
        $('#pw2-check').val('');
        $('#pw2-check').focus();
      }
    }
  })
});


//정규식 표현
let joinForm;
joinForm.memberPw = undefined;

function send(){
  //비밀번호 정규식 : 최소 8 자, 최소 하나의 문자 및 하나의 숫자
  let pwRegex ="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$";
  //핸드폰번호 정규식
  let phoneNumberRegex ="/^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/";
  //이메일 정규식
  let emailRegex="/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i";

  let joinForm;
  if(!pwRegex.test(joinForm.memberPw)){
    return;
  }

  let check;
  if(!check){
    return;
  }

  alert("회원가입 성공!");

  joinForm.submit();
}

// verifyEmail = function() {
//   // 이메일 검증 스크립트 작성
//   let emailVal = $("#mail-check").val();
//
//   // 검증에 사용할 정규식 변수 regExp에 저장
//   let regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
//
//   if (emailVal.match(regExp) == null) {
//     //정규식에 맞지않으면 return null
//     alert('Error');
//   }
//   else {
//     alert('Good!');
//   }
// };