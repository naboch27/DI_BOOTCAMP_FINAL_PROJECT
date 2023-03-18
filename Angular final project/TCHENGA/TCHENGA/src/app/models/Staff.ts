import { Connection } from "./Connection";
import { IdentityDocument } from "./IdentityDocument";
import { Jobs } from "./Jobs";
import { Municipalities } from "./Municipalities";

export class Staff {
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