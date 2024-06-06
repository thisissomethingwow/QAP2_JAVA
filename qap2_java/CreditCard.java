package qap2_java;




public class CreditCard {
    private Money balance;
    private Money limit;
    private Person owner;
//constructor
    public CreditCard(Person newOwner,Money limit){
        this.owner = newOwner;
        this.limit = new Money(limit);
        this.balance = new Money(0);

    }
    //getters
    public Money getBalance() {
        return balance;
    }
    public Money getLimit() {
        return limit;
    }
    public Person getOwner() {
        return owner;
    }
    //charge and making sure id doesnt go over credlim
    public void charge(Money amount){
        Money newBal = balance.add(amount);
        if(newBal.compareTo(limit)>0){
            balance = newBal;
        }else{
             System.out.println("error credlim excideed");
        }
    }
    //payment using the sub method
    public void payment(Money amount){
        balance = balance.sub(amount);
    }

}
