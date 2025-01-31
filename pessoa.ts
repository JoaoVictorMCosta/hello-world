export default class Pessoa{
    private name:string;
    private email:string;
    private birthdate:string;
    private password:string;
    

    constructor(name:string, email:string, birthdate:string,password:string){
        this.name=name;
        this.email=email;
        this.birthdate=birthdate;
        this.password=password;
    }

    public getName():string{
        return this.name;
    }

    public getEmail():string{
        return this.email;
    }

    public getBirthdate():string{
        return this.birthdate;
    }


}