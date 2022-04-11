public class Runner {
    public static void main(String[] args) {
        RoomType[] roomTypes = RoomType.values();

        for (int i = 0; i < roomTypes.length; i++) {
            System.out.println(roomTypes[i]);
        }
    }
}
