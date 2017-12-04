package single;

/**
 * Created by AlexAnderIch on 2017/11/20.
 */
public class allocator {
    private static allocator allocator=null;
    private allocator(){

    }
    public int getNo() {
    if(allocator!=null)
        return allocator.getNo();
    else
        allocator=new allocator();
        allocator.setNo(1);
        return allocator.getNo();
    }

    public void setNo(int no) {
        this.no = no;
    }
    public static allocator getAllocator(){
        if(allocator==null)
        {
            allocator=new allocator();
            allocator.setNo(1);
            return allocator;
        }
        allocator.setNo(allocator.getNo()+1);//每次加一
        return allocator;
    }
    private int no;

}
