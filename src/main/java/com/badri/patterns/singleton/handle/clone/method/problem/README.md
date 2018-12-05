**Clone method problem in singleton -**

* Allowing object or objects to be cloned by some other class does violates the purpose of having the singleton class in application because singleton class should allow one and only one object creation always.
  
**How to solve the problem**

* We need to implement Clonable interface and override the clone method which should throw cloneNotSupportedException.

    // Should override this method and throw an exception if some other class try to clone the object.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }