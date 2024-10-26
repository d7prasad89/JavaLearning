package completeReference.chapter7.varargs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VarArgTest {

    @Test
    void test1() {
        Arguments of = Arguments.of(1, 2, 3);
        Arrays.stream(of.get()).forEach(o ->
                VarArg.test((int)o)
                );
    }
}