package cn.edu.swpu.cins.learnSomethings.dataStructure.stackQueue.dogAndCat;

/**
 * Created by miaomiao on 17-8-19.
 */
public class PetEnterQueue {
    private Pet pet;
    private int count;

    public PetEnterQueue(Pet pet, int count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public int getCount() {
        return count;
    }

    public String getEnterPetType(){
        return this.pet.getType();
    }
}
