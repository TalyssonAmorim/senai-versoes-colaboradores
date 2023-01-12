/*let nomeEstudante = "Helena";
console.log(nomeEstudante);

const nomeDoEstudante = "Helena";
console.log(nomeDoEstudante);

String: nomeEstudante = "Helena";*/

let listaDeEstudante = ["Helena", "Chico", "Mario", "Jose", "Maria"];
let quantidadeEstudante = listaDeEstudante.length;
if (quantidadeEstudante < 5){
    listaDeEstudante.push("João");
    console.log(listaDeEstudante);
}else {
    console.log("Não e possível inserir mais alunos nessa turma");
}

/*for(let indice = 0; indice < quantidadeEstudante; indice++) {
    const alunoCorrente = listaDeEstudante[indice];
    console.log(alunoCorrente);
}

let listaDeEstudante = ["Helena", "Chico", "Mario"];
let quantidadeEstudante = listaDeEstudante.length;
let inicio = 0;

/*do{
    console.log(listaDeEstudante[inicio]);
    inicio++;
} while(inicio < quantidadeEstudante);

while(inicio < quantidadeEstudante) {
    console.log(listaDeEstudante[inicio]);
    inicio++;
}

for (let numero = 1; numero <= 10; numero++){
    console.log(numero);
}*/