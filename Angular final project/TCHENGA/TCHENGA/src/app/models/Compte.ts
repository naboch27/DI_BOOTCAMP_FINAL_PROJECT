import { IdentityDocument } from "./IdentityDocument";
import { Jobs } from "./Jobs";
import { Municipalities } from "./Municipalities";


export class Compte {
    "idPerson":number;
    "firstNamePerson":string;
    "lastNamePersonne":string;
    "phonePerson":string;
    "emailPerson":string;
    "adressePerson":String;
    "municipalitiesEntity":Municipalities;
    "jobsEntity":Jobs;
    "documentEntity":IdentityDocument;
}