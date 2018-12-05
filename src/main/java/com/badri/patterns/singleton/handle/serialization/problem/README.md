Serialization Problem in singleton -

* An Object before serialization & deserialization and an object after serialization & deserialization will not be the same.

How to solve the problem

    // Should implement this method for fixing the serialization problem
    protected Object readResolve(){
        return instance;
    }
     

   