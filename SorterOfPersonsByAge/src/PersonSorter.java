public class PersonSorter {
    Persons [] personsToSort;

    public PersonSorter(Persons[] personsArrayToSort) {
        //this.personsToSort = personsArrayToSort;
        Persons[] sortedArray;
        sortedArray = this.sortArray(personsArrayToSort);
        this.personsToSort = sortedArray;

    }
    private Persons[] sortArray(Persons [] personsArrayToSort){

        boolean  swapped;
        do{
            swapped = false;
            for (int i=0;i<personsArrayToSort.length-1; i++ ){
                if (personsArrayToSort[i].age>personsArrayToSort[i+1].age){
                    swapPersons(personsArrayToSort[i],personsArrayToSort[i+1]);
                    swapped = true;
                }
            }

        } while (swapped);
        return personsArrayToSort;
    }

    private void swapPersons(Persons personsToSwap1, Persons personsToSwap2) {
        String fn= personsToSwap1.firstName;
        String ln=personsToSwap1.lastName;
        int age=personsToSwap1.age;
        personsToSwap1.firstName=personsToSwap2.firstName;
        personsToSwap1.lastName=personsToSwap2.lastName;
        personsToSwap1.age=personsToSwap2.age;
        personsToSwap2.firstName=fn;
        personsToSwap2.lastName=ln;
        personsToSwap2.age=age;

    }
}