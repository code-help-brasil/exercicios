const prompt = require('prompt-sync')();

function main() {
    let distanciaEmMetros = Number(prompt("Digite uma distância em metros:"))      

    let km = distanciaEmMetros / 1000;
    let hm = distanciaEmMetros / 100;
    let dam = distanciaEmMetros / 10;
    let dm = distanciaEmMetros * 10;
    let cm = distanciaEmMetros * 100;
    let mm = distanciaEmMetros * 1000;

    prompt(`A distância de ${distanciaEmMetros} corresponde a: ${km}KM, ${hm}HM, ${dam}DAM, ${dm}DM, ${cm}CM, ${mm}MM`)
}   

module.exports = {
    main
}