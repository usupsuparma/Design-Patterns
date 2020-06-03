<?php


class Store
{

    private $name;

    private $city;

    private $country;

    private $category;

    /**
     * Store constructor.
     * @param $name
     * @param $city
     * @param $country
     */
    public function __construct($name, $city, $country, $category)
    {
        $this->name = $name;
        $this->city = $city;
        $this->country = $country;
        $this->category = $category;
    }

    /**
     * @return mixed
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @return mixed
     */
    public function getCity()
    {
        return $this->city;
    }

    /**
     * @return mixed
     */
    public function getCountry()
    {
        return $this->country;
    }

    /**
     * @param mixed $name
     */
    public function setName($name)
    {
        $this->name = $name;
    }

    /**
     * @param mixed $city
     */
    public function setCity($city)
    {
        $this->city = $city;
    }

    /**
     * @param mixed $country
     */
    public function setCountry($country)
    {
        $this->country = $country;
    }

    /**
     * @param mixed $category
     */
    public function setCategory($category)
    {
        $this->category = $category;
    }



    public function clone() {
        return new Store(
            $this->name,
            $this->city,
            $this->country,
            $this->category
        );
    }


}