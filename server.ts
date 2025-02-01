import Pessoa from "./pessoa";

class Main{
    public static main(){
        const pessoas:Pessoa[]=[];
        pessoas.push(new Pessoa("Joao","joao@email.com","07/03/1999","joao221251"));
        pessoas.push(new Pessoa("Gabriel","gabriel@email.com","08/09/2024","gabriel1234"))
        
        for(let i=0;i<pessoas.length;i++){
          console.log(`Pessoas [${i}] : 
          ${pessoa.toString()}`);
        };
        
        
    }
}

Main.main();