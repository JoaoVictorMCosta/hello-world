"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class Pessoa {
    constructor(name, email, birthdate, password) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
        this.password = password;
    }
    getName() {
        return this.name;
    }
    getEmail() {
        return this.email;
    }
    getBirthdate() {
        return this.birthdate;
    }
    toString() {
        return `Name: ${this.getName()}, 
      Birthdate: ${this.getBirthdate()},
      Email: ${this.getEmail()}`;
    }
}
exports.default = Pessoa;
