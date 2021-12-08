class Switch{
    public static void main(String []args){
        int food = 0;
        
        System.out.println("Please enter the number to choose food :");

        System.out.println("1:Biriani");
        System.out.println("2:Pilau");
        System.out.println("3:Bokoboko");
        System.out.println("4:Tambi");
        System.out.println("5:Mseto");
        System.out.println("6:Wali");
        switch (food){
            case 1:
            System.out.println("Birian cost 5000/=");
            break;
            case 2:
            System.out.println("Pilau cost 3000/=");
            break;
            case 3:
            System.out.println("Bokoboko cost 4000/=");
            break;
            case 4:
            System.out.println("Tambi cost 2500/=");
            break;
            case 5:
            System.out.println("Mseto costs 3500/=");
            break;
            case 6:
            System.out.println("Wali costs 2000/=");
            break;
            default:
            System.out.println("Please choose the correct number:");
            break;
        }


    }
}