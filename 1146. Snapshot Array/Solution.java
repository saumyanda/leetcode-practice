/*
The idea is, the whole array can be large,
and we may take the snap tons of times.
(Like you may always ctrl + S twice)

Instead of record the history of the whole array,
we will record the history of each cell.
And this is the minimum space that we need to record all information.

For each A[i], we will record its history.
With a snap_id and a its value.
*/
//https://youtu.be/DOHvkZ7QpAM
class SnapshotArray {
    
    //array of treemap entries where each entry consists of snapshot id -> value
    //index is maintained within the array of treemap entries
    //first (snap_id) -> value entry is at index 0
    //second (snap_id)-> value entry is at index 1 and so on
    TreeMap<Integer,Integer>[] arr;
    int idx=0;

    public SnapshotArray(int length) {
        arr=new TreeMap[length];
        
        for(int i=0;i<length;i++)
        {
            arr[i]=new TreeMap<Integer,Integer>();
            arr[i].put(0,0);
        }
    }
    
    public void set(int index, int val) {
        arr[index].put(idx,val);
    }
    
    public int snap() {
       return idx++; 
    }
    
    public int get(int index, int snap_id) {
        //When we want to get the value in history, just binary search the time point
        return arr[index].floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
