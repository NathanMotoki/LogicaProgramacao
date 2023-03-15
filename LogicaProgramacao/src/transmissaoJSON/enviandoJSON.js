// Criando Obj JS

var objetoJS = {
    agencia: "5678-9", 
    tipo: "física", 
    nome: "Nathan Motoki", 
    numero: "222.222-22"
};

//Convertendo Obj em JSON

var textoJson = JSON.stringify(objetoJS);

//Redireciona a página para o endereço especificado, passando, via GET, o texto JSON

window.location = "processa/json/?conta=" + textoJson;