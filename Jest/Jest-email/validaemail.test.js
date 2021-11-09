const ValidaEmail=require('./validaemail');

test('email vmacedoh@unsa.edu.pe -> true',()=>{
    expect(ValidaEmail.isValidEmail('vmacedoh@unsa.edu.pe')).toBe(true);

});

test('email 1 -> false',()=>{
    expect(ValidaEmail.isValidEmail('1')).toBe(false);
   
});



