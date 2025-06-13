<?php
/**
 * Calculates the Nth Fibonacci number.
 *
 * @param int $n The index (non-negative integer) of the desired Fibonacci number.
 * @return int|null The Nth Fibonacci number. Returns null for negative input.
 */
function fibonacci($n) {
    if ($n < 0) {
        return null;
    } elseif ($n === 0) {
        return 0;
    } elseif ($n === 1) {
        return 1;
    } else {
        $a = 0;
        $b = 1;
        for ($i = 2; $i <= $n; $i++) {
            $tmp = $b;
            $b = $a + $b;
            $a = $tmp;
        }
        return $b;
    }
}

// Batch test cases
$test_cases = [
    10 => 55,
    0 => 0,
    1 => 1,
    2 => 1,
    5 => 5,
    -1 => null,
    20 => 6765
];

foreach ($test_cases as $input => $expected) {
    $result = fibonacci($input);
    $pass = ($result === $expected) ? 'PASS' : "FAIL (got $result)";
    echo "fibonacci($input) => ";
    var_export($result);
    echo " | Expected: ";
    var_export($expected);
    echo " | $pass\n";
}

