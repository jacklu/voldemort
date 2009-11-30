package voldemort.store.views;

/**
 * A simple test view that translates all reads into uppercase
 * 
 * @author jay
 * 
 */
public class UpperCaseViewTransform implements ViewTransformation<String, String, String> {

    public String fromStoreToView(String k, String s) {
        return s.toUpperCase();
    }

    public String fromViewToStore(String k, String v) {
        throw new UnsupportedViewOperationException("View not writable");
    }

}