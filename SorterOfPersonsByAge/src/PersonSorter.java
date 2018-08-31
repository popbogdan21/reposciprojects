public class PersonSorter {

    public PersonSorter() {
    }

    public Person[] sortPersons(Person[] personArrayToSort){
        sortArray(personArrayToSort);
        return personArrayToSort;
    }

    /** Method that arranges the array using the bubble sorter algorithm
     * @param personArrayToSort - the array that needs to be sorted
     */
    private void sortArray(Person[] personArrayToSort){
        //this.sortArray(personArrayToSort);
        boolean  swapped;
        do{
            swapped = false;
            for (int i = 0; i< personArrayToSort.length-1; i++ ){
                if (personArrayToSort[i].getAge()> personArrayToSort[i+1].getAge()){
                    swapPersons(personArrayToSort[i], personArrayToSort[i+1]);
                    swapped = true;
                }
            }

        } while (swapped);
    }

    /** Method for switching two persons
     * @param personToSwap1- the first person
     * @param personToSwap2- the second person
     */
    private void swapPersons(Person personToSwap1, Person personToSwap2) {
        String fn= personToSwap1.getFirstName();
        String ln= personToSwap1.getLastName();
        int age= personToSwap1.getAge();
        personToSwap1.setFirstName( personToSwap2.getFirstName());
        personToSwap1.setLastName(personToSwap2.getLastName());
        personToSwap1.setAge( personToSwap2.getAge());
        personToSwap2.setFirstName(fn);
        personToSwap2.setLastName(ln);
        personToSwap2.setAge(age);

    }
}