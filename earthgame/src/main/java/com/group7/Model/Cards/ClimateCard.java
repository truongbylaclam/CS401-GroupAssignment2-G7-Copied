package com.group7.Model.Cards;

public class ClimateCard extends Card
{
    String m_habitat;
    public ClimateCard(String name, String habitat, int victoryPoints, String abilityLine) 
    {
        super(name, abilityLine, victoryPoints);
        m_habitat = habitat;

    }
}
