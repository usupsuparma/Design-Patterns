<?php

$store1 = new Store("Toko x", "jakarta", 'Indonesia', "Gadget");
$store2 = new Store("Toko z", "jakarta", 'Indonesia', "Gadget");
$store3 = new Store("Toko x", "bandung", 'Indonesia', "Gadget");
$store4 = new Store("Toko c", "bandung", 'Indonesia', "Fasion");


$store5 = $store1->clone();
$store5->setName('Toko z');