<?php


class Employee
{
    private $name;

    private $title;

    private $salary;

    /**
     * Employee constructor.
     * @param $name
     * @param $title
     * @param $salary
     */
    public function __construct($name, $title, $salary)
    {
        $this->name = $name;
        $this->title = $title;
        $this->salary = $salary;
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
    public function getTitle()
    {
        return $this->title;
    }

    /**
     * @return mixed
     */
    public function getSalary()
    {
        return $this->salary;
    }




}