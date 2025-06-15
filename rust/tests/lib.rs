use fibonacci::fibonacci;

#[test]
fn test_valid_inputs() {
    let cases = [
        (0, 0),
        (1, 1),
        (2, 1),
        (10, 55),
        (20, 6765),
        (50, 12586269025),
        (92, 7540113804746346429),
    ];
    for (input, expected) in cases.iter() {
        assert_eq!(fibonacci(*input), Some(*expected));
    }
}

#[test]
fn test_invalid_inputs() {
    let cases = [-1, -100, 93, 100, i32::MIN, i32::MAX];
    for input in cases.iter() {
        assert_eq!(fibonacci(*input), None);
    }
}
