package com.example.todaline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class driver_info1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_info1);
    }

    public void btn1(View view) {
        String name ="Angelo Agustin";
        String add = "Lebueg, Laoac, Pang.";
        String age = "34";
        String contact = "09634572132";
        String plate = "AER 3491";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn2(View view) {
        String name ="Romeo Basada";
        String add = "Lebueg, Laoac, Pang.";
        String age = "44";
        String contact = "09125673890";
        String plate = "BTD 5342";
        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn3(View view) {
        String name ="Terrence Cabat";
        String add = "D' Alarcio, Laoac, Pang.";
        String age = "46";
        String contact = "09346912585";
        String plate = "ADR 2151";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn4(View view) {
        String name ="Julio Dionio";
        String add = "Cabilaoan, Laoac, Pang.";
        String age = "51";
        String contact = "09267431190";
        String plate = "BGR 3165";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn5(View view) {
        String name ="Ryan Egros";
        String add = "Anis, Laoac, Pang.";
        String age = "35";
        String contact = "09121675340";
        String plate = "HAC 4368";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn6(View view) {
        String name ="Arnold Flores";
        String add = "Anis, Laoac, Pang.";
        String age = "41";
        String contact = "09635611130";
        String plate = "LEN 7465";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn7(View view) {
        String name ="Prince Garcia";
        String add = "Banuar, Laoac, Pang.";
        String age = "47";
        String contact = "09508730414";
        String plate = "SFJ 1344";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn8(View view) {
        String name ="Jade Ibasa";
        String add = "Banuar, Laoac, Pang.";
        String age = "56";
        String contact = "09466950423";
        String plate = "REA 2792";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn9(View view) {
        String name ="June Julian";
        String add = "Balligi, Laoac, Pang.";
        String age = "48";
        String contact = "09567902317";
        String plate = "BNP 6476";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn10(View view) {
        String name ="Glenn Libas";
        String add = "Poblacion, Laoac, Pang.";
        String age = "52";
        String contact = "09126629504";
        String plate = "FOD 4431";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn11(View view) {
        String name ="Robert Manantan";
        String add = "Poblacion, Laoac, Pang.";
        String age = "63";
        String contact = "09275418906";
        String plate = "LSD 1564";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn12(View view) {
        String name ="Clyden Narito";
        String add = "Turko, Laoac, Pang.";
        String age = "45";
        String contact = "09287625527";
        String plate = "CZU 8453";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn13(View view) {
        String name ="Ramon Oblis";
        String add = "Turko, Laoac, Pang.";
        String age = "37";
        String contact = "09462481580";
        String plate = "PKQ 2417";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn14(View view) {
        String name ="Victor Paras";
        String add = "Talogtog, Laoac, Pang.";
        String age = "42";
        String contact = "09101528905";
        String plate = "HRG 4552";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn15(View view) {
        String name ="Henry Ramos";
        String add = "Lebueg, Laoac, Pang.";
        String age = "28";
        String contact = "09275638217";
        String plate = "ZGM 3267";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn16(View view) {
        String name ="Ben Salinas";
        String add = "Cabilaoan, Laoac, Pang.";
        String age = "56";
        String contact = "09163893012";
        String plate = "NXI 4231";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn17(View view) {
        String name ="Marvin Tadeo";
        String add = "D' Alarcio, Laoac, Pang.";
        String age = "62";
        String contact = "09372131450";
        String plate = "FIS 6733";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn18(View view) {
        String name ="Cedrick Tamondong";
        String add = "Anis, Laoac, Pang.";
        String age = "53";
        String contact = "09267089421";
        String plate = "GCE 4412";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn19(View view) {
        String name ="Randy Valdez";
        String add = "Lebueg, Laoac, Pang.";
        String age = "47";
        String contact = "09126548930";
        String plate = "UIO 1236";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }

    public void btn20(View view) {
        String name ="Elmer Villaruz";
        String add = "Anis, Laoac, Pang.";
        String age = "32";
        String contact = "09279547237";
        String plate = "PSJ 5466";

        Intent intent = new Intent(this,pcall.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ADD",add);
        intent.putExtra("AGE", age);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("CONTACT",contact);
        intent.putExtra("PLATE",plate);
        startActivity(intent);
    }
}