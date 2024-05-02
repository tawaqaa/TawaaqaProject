package com.mnashat_dev.touqa;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mnashat_dev.touqa.databinding.FragmentLoginBinding;
import com.mnashat_dev.touqa.databinding.FragmentSignUpBinding;


public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false);

        binding.signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSignUp();
            }
        });
        return binding.getRoot();

    }



    private void navigateToSignUp() {
        NavHostFragment navHostFragment =
                (NavHostFragment) requireActivity().getSupportFragmentManager().findFragmentById(R.id.nav_host_auth);
        NavController navController = navHostFragment.getNavController();
        navController.navigate(R.id.action_loginFragment_to_signUpFragment);
    }
}