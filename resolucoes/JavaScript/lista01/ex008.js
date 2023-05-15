const prompt = require('prompt-sync')();

function main() {
    const distanciaEmMetros = Number(prompt("Digite uma distância em metros:"))      

    const km = distanciaEmMetros / 1000;
    const hm = distanciaEmMetros / 100;
    const dam = distanciaEmMetros / 10;
    const dm = distanciaEmMetros * 10;
    const cm = distanciaEmMetros * 100;
    const mm = distanciaEmMetros * 1000;

    prompt(`A distância de ${distanciaEmMetros} corresponde a: ${km}KM, ${hm}HM, ${dam}DAM, ${dm}DM, ${cm}CM, ${mm}MM`)
}   

module.exports = {
    main
}