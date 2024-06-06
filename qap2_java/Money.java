package qap2_java;

public class Money {
    private long dollars;
    private long cents;
    //constructor and copy constructor
    public Money(double amount){
        this.dollars = (long) amount;
        this.cents = (long) ((amount-dollars)*100);
    }
    public Money(Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    //the adding and subtraction methodes
    public Money add(Money otherAmount){
        long newdollars = this.dollars + otherAmount.dollars;
        long newdcents = this.cents + otherAmount.cents;
        if(cents>100){
            newdollars+=1;
            newdcents-=100;
        }
        return new Money(newdollars+newdcents/100);
    }
    public Money sub(Money otherAmount){
        long newdollars = this.dollars - otherAmount.dollars;
        long newcents = this.cents - otherAmount.cents;
        if(newcents<0){
            newdollars-=1;
            newcents+=100;
        }
        return new Money(newdollars+newcents/100);
    }
    
    //compareTo and equals methods
    public int compareTo(Money otherAmount){
        if(this.dollars < otherAmount.dollars){
            return 1;
        }else if(this.dollars > otherAmount.dollars){
            return -1;
        }else if(this.cents < otherAmount.cents){
            return 1;
        }else if(this.cents > otherAmount.cents){
            return -1;
        } else{
            return 0;
        }
    }
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Money) {
            Money otherMoney = (Money) otherObject;
            return this.dollars == otherMoney.dollars && this.cents == otherMoney.cents;
        }
        return false;
    }

    public String toString(){
        return("$"+dollars+"."+String.format("%02d", cents));
    }
}
