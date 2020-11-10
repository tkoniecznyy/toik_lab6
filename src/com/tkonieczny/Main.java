package com.tkonieczny;

public class Main {


    /**
     * metoda main powinna implementowac algorytm do
     * jak najszybszego wyszukiwania wartosci
     * zmiennej digit z klasy QuizImpl (zakladamy ze
     * programista nie zna zawartosci klasy QuizImpl).
     * Nalezy zalozyc, ze pole digit w klasie QuizImpl
     * moze w kazdej chwili ulec zmianie. Do wyszukiwania
     * odpowiedniej wartosci nalezy wykorzystywac tylko
     * i wylacznie metode isCorrectValue - jesli metoda
     * przestanie rzucac wyjatki wowczas mamy pewnosc ze
     * poszukiwana zmienna zostala odnaleziona.
     */
    public static void main(String[] args)  {

        Quiz quiz = new QuizImpl();
        int digit = 216; // zainicjuj zmienna

        for(int counter = 1; ;counter++) {

            try {

                quiz.isCorrectValue(digit);
                System.out.println("Trafiona proba!!! Szukana liczba to: "
                        + digit + " Ilosc prob: " + counter);
                break;

            } catch(Quiz.ParamTooLarge ptl) {

                System.out.println("Argument za duzy!!!");
                digit--;
            } catch(Quiz.ParamTooSmall pts) {

                System.out.println("Argument za maly!!!");
                digit++;
            }
        }
    }
}


