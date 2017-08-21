package cn.edu.swpu.cins.learnSomethings.dataStructure.stackQueue.dogAndCat;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by miaomiao on 17-8-19.
 */
public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private int count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<>();
        this.catQ = new LinkedList<>();
        this.count = 0;
    }

    public void addAll(Pet pet){
        if(pet.getType().equals("dog")){
            this.dogQ.add(new PetEnterQueue(pet,count++));
        }else if(pet.getType().equals("cat")){
            this.catQ.add(new PetEnterQueue(pet,count++));
        }else {
            throw new RuntimeException("err,not dog or cat!");
        }
    }

    public Pet pollAll(){
        if(!this.dogQ.isEmpty()&&!this.catQ.isEmpty()){
            if(this.dogQ.peek().getCount()<this.catQ.peek().getCount()){
                return this.dogQ.poll().getPet();
            }else {
                return this.catQ.poll().getPet();
            }
        }else if(this.dogQ.isEmpty()){
            return this.catQ.poll().getPet();
        }else if(this.catQ.isEmpty()){
            return this.dogQ.poll().getPet();
        }else{
            throw new RuntimeException("err,Queue is empty");
        }
    }

    public Dog pollDog(){
        if(this.dogQ.isEmpty()){
            throw new RuntimeException("Dog Queue is empty");
        }else {
            return (Dog) this.dogQ.poll().getPet();
        }
    }

    public Cat pollCat(){
        if(this.catQ.isEmpty()){
            throw new RuntimeException("Cat Queue is empty");
        }else {
            return (Cat) this.catQ.poll().getPet();
        }
    }

    public boolean isEmpty(){
        return this.dogQ.isEmpty()&&this.catQ.isEmpty();
    }

    public boolean isDogQueueEmpty(){
        return this.dogQ.isEmpty();
    }

    public boolean isCatQueueEmpty(){
        return this.catQ.isEmpty();
    }

    public static void main(String[] ards){
        DogCatQueue dogCatQueue = new DogCatQueue();

        dogCatQueue.addAll(new Pet("cat"));
        dogCatQueue.addAll(new Pet("dog"));
        dogCatQueue.addAll(new Pet("cat"));
        System.out.println(dogCatQueue.pollAll().getType());
//        System.out.println(dogCatQueue.pollCat());
        dogCatQueue.addAll(new Pet("dog"));
        dogCatQueue.addAll(new Pet("dog"));
    }
}
