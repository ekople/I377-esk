// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package main.entities;

import java.lang.String;

privileged aspect SeadusePunkt_Roo_ToString {
    
    public String SeadusePunkt.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avaja: ").append(getAvaja()).append(", ");
        sb.append("Avatud: ").append(getAvatud()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("IsikuSeadusIntsidendis: ").append(getIsikuSeadusIntsidendis() == null ? "null" : getIsikuSeadusIntsidendis().size()).append(", ");
        sb.append("KehtivAlates: ").append(getKehtivAlates()).append(", ");
        sb.append("KehtivKuni: ").append(getKehtivKuni()).append(", ");
        sb.append("Kommentaar: ").append(getKommentaar()).append(", ");
        sb.append("Muudetud: ").append(getMuudetud()).append(", ");
        sb.append("Muutja: ").append(getMuutja()).append(", ");
        sb.append("ObjektiSeadusIntsidendis: ").append(getObjektiSeadusIntsidendis() == null ? "null" : getObjektiSeadusIntsidendis().size()).append(", ");
        sb.append("Pais: ").append(getPais()).append(", ");
        sb.append("Paragrahv: ").append(getParagrahv()).append(", ");
        sb.append("PiirivalvuriSeadusIntsidendis: ").append(getPiirivalvuriSeadusIntsidendis() == null ? "null" : getPiirivalvuriSeadusIntsidendis().size()).append(", ");
        sb.append("Seadus: ").append(getSeadus()).append(", ");
        sb.append("SeadusePunktId: ").append(getSeadusePunktId()).append(", ");
        sb.append("SeadusePunkts: ").append(getSeadusePunkts() == null ? "null" : getSeadusePunkts().size()).append(", ");
        sb.append("Suletud: ").append(getSuletud()).append(", ");
        sb.append("Sulgeja: ").append(getSulgeja()).append(", ");
        sb.append("Tekst: ").append(getTekst()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}