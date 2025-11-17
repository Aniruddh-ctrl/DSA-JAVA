public class Switch{
    public static void main(String[] args) {
        System.out.println("1.Burger");
        System.out.println("2.Pizza");
        System.out.println("3.Drinks");
        System.out.println("4.Desserts");
        String choice = "Burger";
        switch (choice) {
            case "Burger":
                System.out.println("Rs 100");

                case "Pizza":
                    System.out.println("Rs 200");

                    case "Drinks":
                        System.out.println("Rs 50");

                        case "Desserts":
                            System.out.println("Rs 150");
                              default:
                                System.out.println("Invalid choice");

        }
        }
    }
