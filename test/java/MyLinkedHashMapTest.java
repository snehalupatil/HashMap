import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedHashMapTest {

    @Test
    public void givenASentence_WhenWordAreAddedToList_shouldBeReturnParonoidFrequency(){
        String sentence = "Paranoids are not paranoid because they are paranoid but"+
                            "beecause they keep putting themselves deliberatly into"+
                            "paranoid avoided situations";
        MyLinkedHashMap<String,Integer> myLinkedHashMapHashMap =   new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = myLinkedHashMapHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myLinkedHashMapHashMap.add(word,value);
        }
        int frequency = myLinkedHashMapHashMap.get("paranoid");
        System.out.println(myLinkedHashMapHashMap);
        Assertions.assertEquals(3,frequency);
    }

}
