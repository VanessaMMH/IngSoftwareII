const Person = require('./person');

describe('Person unit tests', () => {
    let person;

 beforeEach(() => {
    person = new Person('John', 30);
 });

 it('Should be an adult John (30) -> true', () => {
    expect(person).toBeDefined();
    expect(person.isAdult()).toBe(true);
 });

 it('Should be an adult John (12) -> false ', () => {
    person.age = 12;
    expect(person).toBeDefined();
    expect(person.isAdult()).toBe(false);
 });

});