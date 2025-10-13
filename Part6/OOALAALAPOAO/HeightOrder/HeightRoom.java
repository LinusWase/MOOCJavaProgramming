import java.util.ArrayList;

public class HeightRoom {
    private ArrayList<HeightPerson> personList;

    public HeightRoom() {
        this.personList = new ArrayList<>();
    }

    public void add(HeightPerson heightPerson){
        personList.add(heightPerson);
    }

    public boolean isEmpty(){
        return personList.isEmpty();
    }

    public ArrayList<HeightPerson> getPersons(){
        return personList;
    }

    public HeightPerson shortest(){
        if (personList.isEmpty()){
            return null;
        }

        HeightPerson shortest = this.personList.get(0);

        for (HeightPerson person : personList){
            if (shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }

    public HeightPerson take(){
        if (personList.isEmpty()){
            return null;
        }

        HeightPerson shortest = shortest();
        this.personList.remove(shortest);
        return shortest;
    }
}
