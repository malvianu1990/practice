package com.anupam.com.anupam;

public enum Element {
    HELIUM("He", "Gas"),
    MAG("MG", "Solid");
    private String chemicalSymbol;
    private String nature;

    private Element(String newChemicalSymbol, String newNature) {
        chemicalSymbol = newChemicalSymbol;
        nature = newNature;
    }

    public String chemicalSymbol() { return chemicalSymbol;}
    public String nature() { return nature;}
}
