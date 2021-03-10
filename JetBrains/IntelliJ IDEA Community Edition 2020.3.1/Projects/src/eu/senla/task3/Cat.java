package eu.senla.task3;

public class Cat {
    private String name = "Mersik";
    private int age = 5;
    public void Cat1() {

        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(name + " " + age);
        }
    }
    public void getsetCat () {

    }
        public void setName (String name){
            this.name = name;
        }
        public String getName () {
            return name;
        }
        public void setAge ( int age){
            this.age = age;
        }
        public int getAge () {
            return age;
        }

        public void KitCat (String name, int age) {
            this.name = name;
            this.age = age;
            int i = 0;
            do {
                i++;
                System.out.println(name + " " + age);
            }
            while (i < 10);
        }
            public void Tom() {
                String name = "Tom";
                int age = 10;
                int [] array = new int[5];
                for (int i: array)
                      {
                          System.out.println(name + " " + age);
                    
                }

        }



}











