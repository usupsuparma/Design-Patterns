<?php


class CustomerBuilder
{
    private $id = 0;

    private $firstName = '';

    private $lastName ='';

    private $email ='';

    private $phone = '';

    private $address = '';

    private $age = '';

    private $hoby = '';

    /**
     * @param mixed $id
     */
    public function setId($id)
    {
        $this->id = $id;
        return $this;
    }

    /**
     * @param mixed $firstName
     */
    public function setFirstName($firstName)
    {
        $this->firstName = $firstName;
        return $this;
    }

    /**
     * @param mixed $lastName
     */
    public function setLastName($lastName)
    {
        $this->lastName = $lastName;
        return $this;
    }

    /**
     * @param mixed $email
     */
    public function setEmail($email)
    {
        $this->email = $email;
        return $this;
    }

    /**
     * @param mixed $phone
     */
    public function setPhone($phone)
    {
        $this->phone = $phone;
        return $this;
    }

    /**
     * @param mixed $address
     */
    public function setAddress($address)
    {
        $this->address = $address;
        return $this;
    }

    /**
     * @param mixed $age
     */
    public function setAge($age)
    {
        $this->age = $age;
        return $this;
    }

    /**
     * @param string $hoby
     */
    public function setHoby(string $hoby)
    {
        $this->hoby = $hoby;
        return $this;
    }



    public function build(): Customer {
        return new Customer(
            $this->id,
            $this->firstName,
            $this->lastName,
            $this->email,
            $this->phone,
            $this->address,
            $this->age,
            $this->hoby
        );
    }
}