let headerInput = document.querySelector(".css-input");
let inputWrapper = document.querySelector("#inputWrapper");

$('.header').load('../header_footer/header.html');

headerInput.addEventListener('focus', function(){
    inputWrapper.style.width = '90%';
    inputWrapper.style.borderColor = '#2e2e2e';
});

headerInput.addEventListener('focusout', function(){
    inputWrapper.style.width = '65%';
    inputWrapper.style.borderColor = 'transparent';
});

