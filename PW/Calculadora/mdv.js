function somar(){
    var n1 = document.getElementById('txtn1');
    var n2 = document.querySelector('#txtn2');
    var result = document.getElementById('res');
    var x = Number(n1.value); //pega o valor da tag - converte string em número
    var y = Number(n2.value);
    var s = x + y;
    //result.innerText = 'A soma de ${x} e ${y} é ${s}'
    
    result.innerHTML = `<strong> ${s} </strong>`;
}

function subtrair(){
    var n1 = document.getElementById('txtn3');
    var n2 = document.querySelector('#txtn4');
    var result = document.getElementById('res2');
    var x = Number(n1.value); 
    var y = Number(n2.value);
    var s = x - y;
    //result.innerText = 'A subtração de ${x} e ${y} é ${s}'
    
    result.innerHTML = `<strong> ${s} </strong>`;
}

function multiplicar(){
    var n1 = document.getElementById('txtn5');
    var n2 = document.querySelector('#txtn6');
    var result = document.getElementById('res3');
    var x = Number(n1.value); 
    var y = Number(n2.value);
    var s = x * y;
    //result.innerText = 'A multiplicação de ${x} e ${y} é ${s}'
    
    result.innerHTML = `<strong> ${s} </strong>`;
}

function dividir(){
    var n1 = document.getElementById('txtn7');
    var n2 = document.querySelector('#txtn8');
    var result = document.getElementById('res4');
    var x = Number(n1.value); 
    var y = Number(n2.value);
    var s = x / y;
    //result.innerText = 'A divisão de ${x} e ${y} é ${s}'
    
    result.innerHTML = `<strong> ${s} </strong>`;
}