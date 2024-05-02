package com.mnashat_dev.touqa;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mnashat_dev.touqa.databinding.FragmentSignUpBinding;

public class signUpFragment extends Fragment {


private FragmentSignUpBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sign_up, container, false);

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToLogin();
            }
        });
        return binding.getRoot();

    }

    private void navigateToLogin() {
        NavHostFragment navHostFragment =
                (NavHostFragment) requireActivity().getSupportFragmentManager().findFragmentById(R.id.nav_host_auth);
        NavController navController = navHostFragment.getNavController();
        navController.navigate(R.id.action_signUpFragment_to_loginFragment);
    }
}