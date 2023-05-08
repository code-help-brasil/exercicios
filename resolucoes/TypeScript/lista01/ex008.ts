import prompt from "prompt-sync"

export function main() {
    const p = prompt()

let distanciaEmMetros = Number(p("Digite uma distância em metros:"))      

let km = distanciaEmMetros / 1000;
let hm = distanciaEmMetros / 100;
let dam = distanciaEmMetros / 10;
let dm = distanciaEmMetros * 10;
let cm = distanciaEmMetros * 100;
let mm = distanciaEmMetros * 1000;

 p(`A distância de ${distanciaEmMetros} corresponde a: ${km}KM, ${hm}HM, ${dam}DAM, ${dm}DM, ${cm}CM, ${mm}MM`)
}