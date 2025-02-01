"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const pessoa_1 = __importDefault(require("./pessoa"));
class Main {
    static main() {
        const pessoas = [];
        pessoas.push(new pessoa_1.default("Joao", "joao@email.com", "07/03/1999", "joao221251"));
        pessoas.push(new pessoa_1.default("Gabriel", "gabriel@email.com", "08/09/2024", "gabriel1234"));
        for (let i = 0; i < pessoas.length; i++) {
            console.log(`Pessoas [${i}] : 
          ${pessoa.toString()}`);
        }
        ;
    }
}
Main.main();
