package com.example.poem2

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.poem2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener,commonication {
    private lateinit var toggle:ActionBarDrawerToggle
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root


//Action bar drawer
        toggle= ActionBarDrawerToggle(this,binding.drawerLayout,R.string.open,R.string.close)
       binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home ->{
                    Toast.makeText(applicationContext,"Click Home",Toast.LENGTH_SHORT).show()
                }

            }
            true
        }
  // button set onclickListener
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
        binding.button5.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
        binding.button7.setOnClickListener(this)
        binding.button8.setOnClickListener(this)
        binding.button9.setOnClickListener(this)
        binding.button10.setOnClickListener(this)
        binding.button11.setOnClickListener(this)
        binding.button12.setOnClickListener(this)
        binding.button13.setOnClickListener(this)
        binding.button14.setOnClickListener(this)
        binding.button15.setOnClickListener(this)
        binding.button16.setOnClickListener(this)
        binding.button17.setOnClickListener(this)
        binding.button18.setOnClickListener(this)
        binding.button19.setOnClickListener(this)
        binding.button20.setOnClickListener(this)
        binding.button21.setOnClickListener(this)
        binding.button22.setOnClickListener(this)
        binding.button23.setOnClickListener(this)
        binding.button24.setOnClickListener(this)
        binding.button25.setOnClickListener(this)
        binding.button26.setOnClickListener(this)
        binding.button27.setOnClickListener(this)
        binding.button28.setOnClickListener(this)

        setContentView(view)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
//Button onClick
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button1 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button1")
            }
            R.id.button2 ->{
                val ajan = getString(R.string.Ajan)
                dataPass(ajan,"Azan")
            }
            R.id.button3 ->{
                val bonDona = getString(R.string.Iqamat)
                dataPass(bonDona,"Iqamat")
            }
            R.id.button4 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button4")
            }
            R.id.button5 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button5")
            }
            R.id.button6 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button6")
            }
            R.id.button7 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button7")
            }
            R.id.button8 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button8")
            }
            R.id.button9 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button9")
            }
            R.id.button10 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button10")
            }
            R.id.button11 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button11")
            }
            R.id.button12 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button12")
            }
            R.id.button13 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button13")
            }
            R.id.button14 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button14")
            }
            R.id.button15 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button15")
            }
            R.id.button16 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button16")
            }
            R.id.button17 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button17")
            }
             R.id.button18 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button18")
            }
            R.id.button19 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button19")
            }
            R.id.button20 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button20")
            }
            R.id.button21 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button21")
            }
            R.id.button22 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button22")
            }
            R.id.button23 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button23")
            }
            R.id.button24 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button24")
            }
            R.id.button25 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button25")
            }
            R.id.button26 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button26")
            }
            R.id.button27 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button27")
            }
            R.id.button28 ->{
                val bonDona = getString(R.string.BonDona)
                dataPass(bonDona,"Button28")
            }
        }
    }
//String pass Home Activity
    override fun dataPass(editText: String,item: String) {

        val passData = Intent(this,HomeActivity::class.java)

        passData.putExtra("key",editText)
        passData.putExtra("id",item)

        startActivity(passData)



    }
}
