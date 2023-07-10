package com.example.myapplication;

import java.util.ArrayList;

public class DatabaseManager {
    DatabaseManager databaseManager = new DatabaseManager();

    private static final ArrayList<String> FoodList;
    private static final ArrayList<String> DrinkList;

    static {
        FoodList = new ArrayList<>();
        DrinkList = new ArrayList<>();

        // Adaugă elementele în lista de mâncare
        FoodList.add("Mar, 52 calorii");
        FoodList.add("Banana, 96 calorii");
        FoodList.add("Ovaz, 154 calorii");
        FoodList.add("Piept de pui, 165 calorii");
        FoodList.add("Somon, 206 calorii");
        FoodList.add("Cartofi, 130 calorii");
        FoodList.add("Orez brun, 111 calorii");
        FoodList.add("Paste integrale, 131 calorii");
        FoodList.add("Unt de arahide, 588 calorii");
        FoodList.add("Lapte degresat, 39 calorii");
        FoodList.add("Iaurt grecesc, 97 calorii");
        FoodList.add("Ou fiert, 155 calorii");
        FoodList.add("Morcov, 41 calorii");
        FoodList.add("Spanac, 23 calorii");
        FoodList.add("Alune, 579 calorii");
        FoodList.add("Paine integrala, 74 calorii");
        FoodList.add("Paste din grau dur, 352 calorii");
        FoodList.add("Branza cheddar, 403 calorii");
        FoodList.add("Avocado, 160 calorii");
        FoodList.add("Carne de vita, 250-300 calorii");
        FoodList.add("Bacon, 42 calorii");
        FoodList.add("Ananas, 50 calorii");
        FoodList.add("Capsuni, 32 calorii");
        FoodList.add("Ciocolata neagra (70-85% cacao), 600-650 calorii");
        FoodList.add("Nuci, 600-700 calorii");
        FoodList.add("Cafea neagra, 2 calorii");
        FoodList.add("Ceai verde, 1-2 calorii");
        FoodList.add("Biscuiti digestivi, 80-90 calorii");
        FoodList.add("Pizza margherita, 250-300 calorii per felie");
        FoodList.add("Biscuiti Oreo, 53 calorii per biscuit");
        FoodList.add("Ciocolata cu lapte, 550-600 calorii per 100 de grame");
        FoodList.add("Porumb dulce, 86 calorii per 100 de grame");
        FoodList.add("Seminte de dovleac, 560-600 calorii per 100 de grame");
        FoodList.add("Miere, 304 calorii per 100 de grame");
        FoodList.add("Carnaciori, 280-320 calorii per 100 de grame");
        FoodList.add("Carnati, 250-300 calorii per 100 de grame");
        FoodList.add("Cartofi prajiti, 319 calorii per 100 de grame");
        FoodList.add("Masline, 115-145 calorii per 100 de grame");
        FoodList.add("Piersici, 39 calorii");
        FoodList.add("Afine, 57 calorii");
        FoodList.add("Capsuni, 32 calorii");
        FoodList.add("Kiwi, 41 calorii");
        FoodList.add("Pepene galben, 30 calorii");
        FoodList.add("Avocado, 160 calorii");
        FoodList.add("Ciuperci, 22 calorii");
        FoodList.add("Vinete, 25 calorii");
        FoodList.add("Sparanghel, 20 calorii");
        FoodList.add("Quinoa, 120 calorii");
        FoodList.add("Mazare, 81 calorii");
        FoodList.add("Broccoli, 55 calorii");
        FoodList.add("Pepene rosu, 30 calorii");
        FoodList.add("Portocala, 43 calorii");
        FoodList.add("Grapefruit, 52 calorii");
        FoodList.add("Mango, 60 calorii");
        FoodList.add("Pepene verde, 30 calorii");
        FoodList.add("Ceapa, 40 calorii");
        FoodList.add("Ardei gras, 31 calorii");
        FoodList.add("Sparanghel, 20 calorii");
        FoodList.add("Telina, 16 calorii");
        FoodList.add("Fasole neagra, 339 calorii");
        FoodList.add("Linte, 116 calorii");
        FoodList.add("Catel de usturoi, 4 calorii");
        FoodList.add("Seminte de susan, 590 calorii");
        FoodList.add("Seminte de floarea-soarelui, 584 calorii");
        FoodList.add("Seminte de in, 534 calorii");
        FoodList.add("Praz, 61 calorii");
        FoodList.add("Patrunjel, 36 calorii");
        FoodList.add("Sparanghel, 20 calorii");
        FoodList.add("Salata verde, 5 calorii");
        FoodList.add("Varza, 25 calorii");
        FoodList.add("Vinete, 25 calorii");
        FoodList.add("Morcovi, 41 calorii");
        FoodList.add("Telina, 16 calorii");
        FoodList.add("Ciuperci, 22 calorii");
        FoodList.add("Castraveti, 16 calorii");


        // Adaugă elementele în lista de băuturi
        DrinkList.add("Apa plata, 0 calorii");
        DrinkList.add("Apa cu lamaie, 4 calorii");
        DrinkList.add("Apa cu castraveți, 1 calorii");
        DrinkList.add("Suc de portocale, 45 calorii");
        DrinkList.add("Suc de mere, 54 calorii");
        DrinkList.add("Apa plata, 0 calorii");
        DrinkList.add("Apa cu lamaie, 4 calorii");
        DrinkList.add("Apa cu castraveți, 1 calorii");
        DrinkList.add("Suc de portocale, 45 calorii");
        DrinkList.add("Suc de mere, 54 calorii");
        DrinkList.add("Suc de struguri, 70 calorii");
        DrinkList.add("Suc de ananas, 133 calorii");
        DrinkList.add("Suc de piersici, 60 calorii");
        DrinkList.add("Suc de morcovi, 41 calorii");
        DrinkList.add("Suc de rosii, 17 calorii");
        DrinkList.add("Cafea neagra, 2 calorii");
        DrinkList.add("Cafea cu lapte, 30 calorii");
        DrinkList.add("Cappuccino, 105 calorii");
        DrinkList.add("Latte, 150 calorii");
        DrinkList.add("Espresso, 3 calorii");
        DrinkList.add("Ceai verde, 1-2 calorii");
        DrinkList.add("Ceai negru, 2-5 calorii");
        DrinkList.add("Ceai de fructe, 0-5 calorii");
        DrinkList.add("Ceai de menta, 0 calorii");
        DrinkList.add("Ceai de ghimbir, 0-5 calorii");
        DrinkList.add("Ceai de hibiscus, 0 calorii");
        DrinkList.add("Ceai de fructe cu gheata, 10-30 calorii");
        DrinkList.add("Smoothie de fructe proaspete, 80-150 calorii");
        DrinkList.add("Smoothie cu iaurt, 120-250 calorii");
        DrinkList.add("Limonada, 100-150 calorii");
        DrinkList.add("Cola, 140-150 calorii");
        DrinkList.add("Suc de fructe carbogazos, 90-150 calorii");
        DrinkList.add("Bere, 150-250 calorii");
        DrinkList.add("Vin alb, 120-150 calorii");
        DrinkList.add("Cafea cu lapte si zahar, 56 calorii");
        DrinkList.add("Cafea cu frisca, 120 calorii");
        DrinkList.add("Cafea cu ciocolata calda, 150 calorii");
        DrinkList.add("Ciocolata calda, 120 calorii");
        DrinkList.add("Ciocolata calda cu frisca, 180 calorii");
        DrinkList.add("Ceai cu lapte, 30 calorii");
        DrinkList.add("Ceai cu miere, 64 calorii");
        DrinkList.add("Ceai cu lamaie si miere, 56 calorii");
        DrinkList.add("Ceai cu scortisoara, 2 calorii");
        DrinkList.add("Suc de grapefruit, 52 calorii");
        DrinkList.add("Suc de mere si sfecla rosie, 60 calorii");
        DrinkList.add("Suc de grepfrut si portocale, 48 calorii");
        DrinkList.add("Suc de capsuni, 32 calorii");
        DrinkList.add("Suc de afine, 57 calorii");
        DrinkList.add("Smoothie de banane, 120 calorii");
        DrinkList.add("Smoothie de mango, 130 calorii");
        DrinkList.add("Smoothie de capsuni, 90 calorii");
        DrinkList.add("Limonada cu zahar, 120 calorii");
        DrinkList.add("Limonada dietetica, 0 calorii");
        DrinkList.add("Limonada cu menta, 100 calorii");
        DrinkList.add("Apa tonica, 83 calorii");
        DrinkList.add("Apa minerala, 0 calorii");
        DrinkList.add("Lapte, 60 calorii");

    }

    public static ArrayList<String> getFoodList() {

        return FoodList;
    }

    public static ArrayList<String> getDrinkList() {

        return DrinkList;
    }



}